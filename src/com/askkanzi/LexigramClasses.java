package com.askkanzi;


public enum LexigramClasses {

    AUTONOMOUS_ACTORS(Color.VIOLET),
    SPACIAL_OBJECTS(Color.ORANGE),
    INGESTIBLES(Color.RED),
    PARTS_OF_BODY(Color.GREEN),
    STATES_AND_CONDITIONS(Color.BLUEGREY),
    ACTIVITIES(Color.BLUE),
    PREPOSITIONS_DETERMINERS_PARTICLES(Color.BLACK),
    AFFIRMATION(Color.WHITE),
    SENTIMENTAL_MODIFIERS(Color.YELLOW);

    private final Color color;

    LexigramClasses(Color color) {
        this.color = color;
    }

    public Color getColor() { return color; }


}

