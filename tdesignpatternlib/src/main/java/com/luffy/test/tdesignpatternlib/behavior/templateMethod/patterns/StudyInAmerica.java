package com.luffy.test.tdesignpatternlib.behavior.templateMethod.patterns;

/**
 * Created by lvlufei on 2020-08-11
 *
 * @name 留学美国（具体子类）
 */
public class StudyInAmerica extends StudyAbroad {
    @Override
    public String lookingForSchool() {
        StringBuilder sb = new StringBuilder();
        sb.append("一.索取学校以下资料：").append("\n");
        sb.append("  1）对留学意向国家的政治、经济、文化背景和教育体制、学术水平进行较为全面的了解；").append("\n");
        sb.append("  2）全面了解和掌握国外学校的情况，包括历史、学费、学制、专业、师资配备、教学设施、学术地位、学生人数等；").append("\n");
        sb.append("  3）了解该学校的住宿、交通、医疗保险情况如何；").append("\n");
        sb.append("  4）该学校在中国是否有授权代理招生的留学中介公司？").append("\n");
        sb.append("  5）掌握留学签证情况；").append("\n");
        sb.append("  6）该国政府是否允许留学生合法打工？").append("\n");
        sb.append("  8）毕业之后可否移民？").append("\n");
        sb.append("  9）文凭是否受到我国认可？").append("\n");
        return sb.toString();
    }

    @Override
    public String applyForEnrol() {
        StringBuilder sb = new StringBuilder();
        sb.append("二.入学申请：").append("\n");
        sb.append("  1）填写报名表；").append("\n");
        sb.append("  2）将报名表、个人学历证明、最近的学习成绩单、推荐信、个人简历、托福或雅思语言考试成绩单等资料寄往所申请的学校；").append("\n");
        sb.append("  3）为了给签证办理留有充裕的时间，建议越早申请越好，一般提前1年就比较从容。").append("\n");
        return sb.toString();
    }

    @Override
    public String arriving() {
        StringBuilder sb = new StringBuilder();
        sb.append("六.抵达目标学校：").append("\n");
        sb.append("  1）安排住宿；").append("\n");
        sb.append("  2）了解校园及周边环境。").append("\n");
        return sb.toString();
    }
}
