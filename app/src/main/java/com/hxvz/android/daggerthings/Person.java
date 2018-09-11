package com.hxvz.android.daggerthings;

public class Person {
    Profession profession;
    Knowledge knowledge;

    Person(Profession profession, Knowledge knowledge) {
        this.profession = profession;
        this.knowledge = knowledge;
    }

    public String work() {
        return profession.work();
    }

    public String play() {
        return profession.play();
    }

    public void learn(Book book) {
        knowledge.learn(book);
    }

    public String getSkillSet() {
        return knowledge.getSkillSet();
    }
}
