package com.tts;

//WHEN CONSTRUCTING OBJECTS, CLASSES ARE UTILIZED AS TYPES
//IN ESSENCE, WE'RE CREATING A CUSTOM TYPE, IN THIS CASE, TYPE "CHAPSTICK"

    public class Chapstick {

        //BELOW ARE SOME *PROPERTIES* OF Chapstick
        //PROPERTIES ARE ALSO REFERRED TO AS "fields"
        public String shape;
        public String composition;
        private String flavor;
        //FIELDS SHOULD ALWAYS BE PRIVATE, AS YOU ONLY WANT THE
        //DEVELOPER TO BE ABLE TO CHANGE THEM (SUBWAY RESTAURANT EXAMPLE)

        //BELOW, IS A *METHOD*
        // think of methods as your "verbs" / "actions"
        public void soothe() {
            System.out.println("This chapstick is very soothing.");
        }

        public Chapstick(String flavor) {
            this.flavor = flavor;
        }

        // this has access to the field flavor
        // EVEN THO "FLAVOR" IS PRIVATE, THIS *GETTER* CAN ACCESS ITS CONTENTS
        public String getFlavor() {
            return flavor;
        }

        //BELOW IS A *SETTER*
        //SETTERS ARE NOT OFTEN USED
        //setFlavor CAN CHANGE THE VALUE OF flavor
        //for a particular instance of myChapstick
        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

    }

