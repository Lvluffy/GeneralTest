package com.luffy.test.tdesignpatternlib.behavior.templateMethod.patterns;

/**
 * Created by lvlufei on 2020-08-11
 *
 * @name 出国留学（抽象类）
 */
public abstract class StudyAbroad {

    public String templateMethod() {
        StringBuilder sb = new StringBuilder();
        //1,索取学校资料
        sb.append(lookingForSchool());
        //2,入学申请
        sb.append(applyForEnrol());
        //3,办理因私出国护照、出境卡和公证
        sb.append(applyForPassport());
        //4,申请签证
        sb.append(applyForVisa());
        //5,体检、订机票、准备行装
        sb.append(readyGoAbroad());
        //6,抵达
        sb.append(arriving());
        return sb.toString();
    }

    /**
     * 办理因私出国护照、出境卡和公证
     *
     * @return
     */
    public String applyForPassport() {
        StringBuilder sb = new StringBuilder();
        sb.append("三.办理因私出国护照、出境卡和公证：").append("\n");
        sb.append("  1）持录取通知书、本人户口簿或身份证向户口所在地公安机关申请办理因私出国护照和出境卡。").append("\n");
        sb.append("  2）办理出生公证书，学历、学位和成绩公证，经历证书，亲属关系公证，经济担保公证。").append("\n");
        return sb.toString();
    }

    /**
     * 申请签证
     *
     * @return
     */
    public String applyForVisa() {
        StringBuilder sb = new StringBuilder();
        sb.append("四.申请签证：").append("\n");
        sb.append("  1）准备申请国外境签证所需的各种资料，包括个人学历、成绩单、工作经历的证明；个人及家庭收入、资金和财产证明；家庭成员的关系证明等；").append("\n");
        sb.append("  2）向拟留学国家驻华使(领)馆申请入境签证。申请时需按要求填写有关表格，递交必需的证明材料，缴纳签证。有的国家(比如美国、英国、加拿大等)在申请签证时会要求申请人前往使(领)馆进行面试。").append("\n");
        return sb.toString();
    }

    /**
     * 体检、订机票、准备行装
     *
     * @return
     */
    public String readyGoAbroad() {
        StringBuilder sb = new StringBuilder();
        sb.append("五.体检、订机票、准备行装：").append("\n");
        sb.append("  1）进行身体检查、免疫检查和接种传染病疫苗；").append("\n");
        sb.append("  2）确定机票时间、航班和转机地点。").append("\n");
        return sb.toString();
    }

    /**
     * 索取学校资料
     *
     * @return
     */
    public abstract String lookingForSchool();

    /**
     * 入学申请
     *
     * @return
     */
    public abstract String applyForEnrol();

    /**
     * 抵达
     *
     * @return
     */
    public abstract String arriving();
}
