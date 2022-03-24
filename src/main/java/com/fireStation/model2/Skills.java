package com.fireStation.model2;

public class Skills {
    private String programming;
    private String scripting;
    private String ml;

    public Skills() {
    }

    public Skills(String programming, String scripting, String ml) {
        this.programming = programming;
        this.scripting = scripting;
        this.ml = ml;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getScripting() {
        return scripting;
    }

    public void setScripting(String scripting) {
        this.scripting = scripting;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "programming='" + programming + '\'' +
                ", scripting='" + scripting + '\'' +
                ", ml='" + ml + '\'' +
                '}';
    }
}
