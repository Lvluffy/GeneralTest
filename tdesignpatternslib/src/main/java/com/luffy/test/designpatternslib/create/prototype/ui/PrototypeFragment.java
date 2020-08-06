package com.luffy.test.designpatternslib.create.prototype.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.create.prototype.patterns.Shape;
import com.luffy.test.designpatternslib.create.prototype.patterns.ShapePrototypeManager;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import java.text.DecimalFormat;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 原型
 */
public class PrototypeFragment extends BaseFragment {

    @BindView(R2.id.edit_circle)
    EditText editCircle;
    @BindView(R2.id.txt_area_circle)
    TextView txtAreaCircle;
    @BindView(R2.id.edit_square)
    EditText editSquare;
    @BindView(R2.id.txt_area_square)
    TextView txtAreaSquare;
    @BindView(R2.id.edit_rectangle_long)
    EditText editRectangleLong;
    @BindView(R2.id.edit_rectangle_wide)
    EditText editRectangleWide;
    @BindView(R2.id.txt_area_rectangle)
    TextView txtAreaRectangle;
    @BindView(R2.id.edit_triangle_end)
    EditText editTriangleEnd;
    @BindView(R2.id.edit_triangle_high)
    EditText editTriangleHigh;
    @BindView(R2.id.txt_area_triangle)
    TextView txtAreaTriangle;

    private ShapePrototypeManager mShapePrototypeManager;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_prototype, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mShapePrototypeManager = new ShapePrototypeManager();
    }

    @OnClick({R2.id.btn_count_circle,
            R2.id.btn_count_square,
            R2.id.btn_count_rectangle,
            R2.id.btn_count_triangle})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_count_circle) {
            countCircle();
        } else if (id == R.id.btn_count_square) {
            countSquare();
        } else if (id == R.id.btn_count_rectangle) {
            countRectangle();
        } else if (id == R.id.btn_count_triangle) {
            countTriangle();
        }
    }

    /**
     * 计算圆
     */
    private void countCircle() {
        if (editCircle.getText().toString().length() == 0) {
            Toast.makeText(mContext, getString(R.string.prototype_circle_hint), Toast.LENGTH_SHORT).show();
            return;
        }
        Shape circle = mShapePrototypeManager.getShape(ShapePrototypeManager.KEY_CIRCLE);
        int radius = Integer.parseInt(editCircle.getText().toString());
        txtAreaCircle.setText(getString(R.string.prototype_circle_desc,
                String.valueOf(radius),
                new DecimalFormat("#.##").format(circle.countArea(radius))));
    }

    /**
     * 计算正方形
     */
    private void countSquare() {
        if (editSquare.getText().toString().length() == 0) {
            Toast.makeText(mContext, getString(R.string.prototype_square_hint), Toast.LENGTH_SHORT).show();
            return;
        }
        Shape square = mShapePrototypeManager.getShape(ShapePrototypeManager.KEY_SQUARE);
        int side = Integer.parseInt(editSquare.getText().toString());
        txtAreaSquare.setText(getString(R.string.prototype_square_desc,
                String.valueOf(side),
                new DecimalFormat("#.##").format(square.countArea(side))));
    }

    /**
     * 计算长方形
     */
    private void countRectangle() {
        if (editRectangleLong.getText().toString().length() == 0) {
            Toast.makeText(mContext, getString(R.string.prototype_rectangle_long_hint), Toast.LENGTH_SHORT).show();
            return;
        }
        if (editRectangleWide.getText().toString().length() == 0) {
            Toast.makeText(mContext, getString(R.string.prototype_rectangle_wide_hint), Toast.LENGTH_SHORT).show();
            return;
        }
        Shape rectangle = mShapePrototypeManager.getShape(ShapePrototypeManager.KEY_RECTANGLE);
        int lon = Integer.parseInt(editRectangleLong.getText().toString());
        int wide = Integer.parseInt(editRectangleWide.getText().toString());
        txtAreaRectangle.setText(getString(R.string.prototype_rectangle_desc,
                String.valueOf(lon),
                String.valueOf(wide),
                new DecimalFormat("#.##").format(rectangle.countArea(lon, wide))));
    }

    /**
     * 计算三角形
     */
    private void countTriangle() {
        if (editTriangleEnd.getText().toString().length() == 0) {
            Toast.makeText(mContext, getString(R.string.prototype_triangle_end_hint), Toast.LENGTH_SHORT).show();
            return;
        }
        if (editTriangleHigh.getText().toString().length() == 0) {
            Toast.makeText(mContext, getString(R.string.prototype_triangle_high_hint), Toast.LENGTH_SHORT).show();
            return;
        }
        Shape triangle = mShapePrototypeManager.getShape(ShapePrototypeManager.KEY_TRIANGLE);
        int end = Integer.parseInt(editTriangleEnd.getText().toString());
        int high = Integer.parseInt(editTriangleHigh.getText().toString());
        txtAreaTriangle.setText(getString(R.string.prototype_triangle_desc,
                String.valueOf(end),
                String.valueOf(high),
                new DecimalFormat("#.##").format(triangle.countArea(end, high))));
    }

}
