package com.askkanzi;


public enum LexigramOperationalClass {

    FAMILIAR_PRIMATE("AP"),
    UNFAMILIAR_PRIMATE("AV"),
    NON_PRIMATE("AO"),
    INANIMATE_ACTOR("AM");

    private final String classes;

    LexigramOperationalClass(String classes) {
        this.classes = classes;
    }

    public String getClasses(){
        return classes;
    }


}
