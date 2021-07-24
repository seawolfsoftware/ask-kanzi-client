package com.askkanzi;


public enum LexigramClasses {

    AUTONOMOUS_ACTORS(Color.VIOLET, new LexigramOperationalClass[]{
                                        LexigramOperationalClass.FAMILIAR_PRIMATE,
                                        LexigramOperationalClass.UNFAMILIAR_PRIMATE,
                                        LexigramOperationalClass.NON_PRIMATE,
                                        LexigramOperationalClass.INANIMATE_ACTOR});
//    AUTONOMOUS_ACTORS(Color.VIOLET,new String[]{"AP", "AV", "AO", "AM"}),
//    SPACIAL_OBJECTS(Color.ORANGE, new String[]{"FA", "FP", "TF", "CT", "WR"}),
//    INGESTIBLES(Color.RED, new String[]{"EU", "EM", "ED"}),
//    PARTS_OF_BODY(Color.GREEN, new String[]{"PB"}),
//    STATES_AND_CONDITIONS(Color.BLUEGREY, new String[]{"ST", "LS", "CD"}),
//    ACTIVITIES(Color.BLUE, new String[]{"VA", "VB", "VC", "VD", "VE", "VG", "VL", "VM", "VP", "VS", "VW"}),
//    PREPOSITIONS_DETERMINERS_PARTICLES(Color.BLACK, new String[]{"DC", "DD", "DO", "DP", "LP", "ID", "NF", "PP"}),
//    AFFIRMATION(Color.WHITE, new String[]{"YES"}),
//    SENTIMENTAL_MODIFIERS(Color.YELLOW, new String[]{"Query", "Please", "Negation", "Period"});

    private final Color color;
    private final LexigramOperationalClass[] classes;

    LexigramClasses(Color color, LexigramOperationalClass[] classes) {

        this.color = color;
        this.classes = classes;
    }

    public Color getColor() { return color; }

    public LexigramOperationalClass[] getClasses(){
        return classes;
    }


}

