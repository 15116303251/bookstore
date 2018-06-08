package com.king.bookstore.common.variable;

/**
 * 分类对应的表名
 */
public enum BookToTableEnum {

    //教育
    textbook_puj("研究生/本科/专科教材","textbook_puj"),

    textbook_h("高职高专教材","textbook_high"),

    english_comprehensive_book("英语综合教程","english_comprehensive_book"),
    english_language_training_book("英语专项训练","english_language_training_book"),



    //青春烂漫/爱情/情感
    young_school_book("校园","young_school_book"),

    young_love_book("爱情/情感","young_love_book"),

    young_maincartoon_book("大陆漫画","young_maincartoon_book"),

    young_hongkongcartoon_book("香港漫画","young_hongkongcartoon_book"),

    //文艺
    literature_art_documentary_book("纪实文学","literature_art_documentary_book"),

    literature_art_corpus_book("文集","literature_art_corpus_book"),

    photography_introduction_book("摄影入门","photography_introduction_book"),

    photography_theory_book("摄影理论","photography_theory_book"),

    //人文社科
    history_chinese_book("中国史","history_chinese_book"),

    history_world_book("世界史","history_world_book"),

    history_ancient_book("古籍整理","history_ancient_book"),

    history_aass_book("经部","history_aass_book");



    // 定义私有变量
    private String nName;
    private String nTable;

    // 构造函数，枚举类型只能为私有

    private BookToTableEnum(String _nName, String nTable) {
        this.nName=_nName;
        this.nTable = nTable;
    }

    public String getnTable() {
        return nTable;
    }

    public String getnName() {
        return nName;
    }

    public static String getTable(String value){
        for(BookToTableEnum stageCodeEnum : values()){
            if(stageCodeEnum.getnName().equals(value)){
                return stageCodeEnum.getnTable();
            }
        }
        return "不存在此表";
    }

}
