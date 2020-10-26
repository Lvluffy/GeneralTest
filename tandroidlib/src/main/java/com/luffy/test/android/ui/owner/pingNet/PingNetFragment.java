package com.luffy.test.android.ui.owner.pingNet;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.utils.PingNet;
import com.luffy.test.android.utils.PingNetEntity;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-27
 *
 * @name
 */
public class PingNetFragment extends BaseFragment {

    public static final int MESSAGE_WHAT = 1;

    @BindView(R2.id.txt_content)
    TextView txtContent;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_WHAT:
                    txtContent.setText((CharSequence) msg.obj);
                    break;
            }
        }
    };

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ping_net, container, false);
    }

    @OnClick({R2.id.btn})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn) {
            startPing();
        }
    }

    private void startPing() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //stuapi.xiaoxiedu.com
                //app.kzyanyi.com
                PingNetEntity pingNetEntity = new PingNetEntity("app.kzyanyi.com", 3, 5, new StringBuffer());
                pingNetEntity = PingNet.ping(pingNetEntity);

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ip=").append(pingNetEntity.getIp()).append("\n");
                stringBuilder.append("time=").append(pingNetEntity.getPingTime()).append("\n");
                stringBuilder.append("result=").append(pingNetEntity.isResult()).append("\n");
                stringBuilder.append("resultBuffer=").append(pingNetEntity.getResultBuffer().toString()).append("\n");

                Message message = new Message();
                message.what = MESSAGE_WHAT;
                message.obj = stringBuilder.toString();
                mHandler.sendMessage(message);
            }
        }).start();
    }
}
