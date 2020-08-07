package com.luffy.test.designpatternslib.structure.proxy.patterns;

import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 汾酒种类
 */
public enum FenChiewKind {
    KIND_NO_1("杏花村酒", "杏花村汾酒不仅是中国第一文化名酒，而且是名酒之始祖，\"最早国酒\"，国之瑰宝，凝聚着我国古代劳动人民的智慧，闪耀着中华民族文化的光辉，犹如中华上空升起一颗闪亮的启明星。", R.drawable.proxy_kind_no1),
    KIND_NO_2("杏花春酒", "杏花春酒是山西杏花村汾酒集团有限责任公司为国有独资公司生产的，它的酒史、酒质、酒器自然天成，独树一帜。山西杏花村汾酒集团有限责任公司以生产经营中国名酒——汾酒、竹叶青酒为主营业务，每年年产名优白酒5万吨，是全国大的名优白酒生产基地之一。", R.drawable.proxy_kind_no2),
    KIND_NO_3("白玉汾酒", "白玉汾酒以汾酒作底，与中药材“紫油桂”混合浸泡，蒸馏提香，加入糖液，形成独特味道。该酒清亮透明，芳香浓郁，绵软甘甜，落口清爽。由于紫油桂“温肾祛火、去寒止痛”的药用功能，使白玉汾酒成为一种有效的暖胃酒。", R.drawable.proxy_kind_no3),
    KIND_NO_4("青花瓷汾酒", "青花瓷汾酒，其酒液晶莹透亮，清香纯正，幽雅芳香，绵甜爽净，酒体丰满，回味悠长，是汾酒的\"特中之特\"，是清香型汾酒的顶级精品。", R.drawable.proxy_kind_no4),
    KIND_NO_5("玫瑰汾酒", "玫瑰汾酒又名玫瑰酒，系汾酒配制的系列产品，1904年试制投产，1938年日本侵华后被迫停产，1956年恢复生产，产品远销港澳地区及东南亚各国，2009年新品玫瑰汾酒上市。", R.drawable.proxy_kind_no5);

    private String name;
    private String desc;
    private int logo;

    FenChiewKind(String name, String desc, int logo) {
        this.name = name;
        this.desc = desc;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getLogo() {
        return logo;
    }
}