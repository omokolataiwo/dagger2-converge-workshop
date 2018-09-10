package com.hxvz.android.daggerthings;

import javax.inject.Inject;

public class Person {
    @Inject
    Profession profession;
    @Inject
    Knowledge knowledge;

    @Inject
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
