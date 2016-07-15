/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bootsfacesissues;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Mirco
 */
@Named
@SessionScoped
public class BackingBean implements Serializable {

    private List<Thing> thingsList;
    private Thing newThing;

    public BackingBean() {
    }

    @PostConstruct
    private void init() {
	newThing = new Thing();
	thingsList = new ArrayList<>();
	Thing thing1 = new Thing();
	thing1.setId(1);
	thing1.setName("name1");
	thing1.setDescription("description1");
	Thing thing2 = new Thing();
	thing2.setId(2);
	thing2.setName("name2");
	thing2.setDescription("description2");
	Thing thing3 = new Thing();
	thing3.setId(3);
	thing3.setName("name3");
	thing3.setDescription("description2");

	thingsList.add(thing1);
	thingsList.add(thing2);
	thingsList.add(thing3);

    }

    public List<Thing> getThingsList() {
	return thingsList;
    }

    public void setThingsList(List<Thing> thingsList) {
	this.thingsList = thingsList;
    }

    public void deleteThing(Thing thing) {
	thingsList.remove(thing);
    }

    public void editThing(Thing thing) {

    }

    public Thing getNewThing() {
	return newThing;
    }

    public void setNewThing(Thing newThing) {
	this.newThing = newThing;
    }

}
