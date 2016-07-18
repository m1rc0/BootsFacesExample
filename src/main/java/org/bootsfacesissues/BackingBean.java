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
import org.chartistjsf.model.chart.AspectRatio;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Mirco
 */
@Named
@SessionScoped
public class BackingBean implements Serializable {

    private List<Thing> thingsList;
    private Thing newThing;
    private LineChartModel lineModel1;
    private org.chartistjsf.model.chart.LineChartModel lineModel2;

    public BackingBean() {
    }

    @PostConstruct
    private void init() {
	newThing = new Thing();
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

	createPrimeLineModels();
	createChartistLineModel();

    }

    public void dummyAction() {

    }

    private void createPrimeLineModels() {
	lineModel1 = initLinearModel();
	lineModel1.setTitle("PrimeFaces Linear Chart");
	lineModel1.setLegendPosition("e");
	Axis yAxis = lineModel1.getAxis(AxisType.Y);
	yAxis.setMin(0);
	yAxis.setMax(1);
    }

    private LineChartModel initLinearModel() {
	LineChartModel model = new LineChartModel();

	LineChartSeries series1 = new LineChartSeries();
	series1.setLabel("Series 1");
	series1.setFill(true);

	series1.set(0, 0);
	series1.set(2, 1);
	series1.set(4, 0);

	LineChartSeries series2 = new LineChartSeries();
	series2.setLabel("Series 2");
	series2.setFill(true);
	
	series2.set(2, 0);
	series2.set(4, 1);
	series2.set(6, 0);

	model.addSeries(series1);
	model.addSeries(series2);

	return model;
    }
    
    public void createChartistLineModel() {
	
		lineModel2 = new org.chartistjsf.model.chart.LineChartModel();
		lineModel2.setAspectRatio(AspectRatio.GOLDEN_SECTION);
		lineModel2.setShowArea(true);

		lineModel2.addLabel("1");
		lineModel2.addLabel("2");
		lineModel2.addLabel("3");
		lineModel2.addLabel("4");
		lineModel2.addLabel("5");
		lineModel2.addLabel("6");
		lineModel2.addLabel("7");
		lineModel2.addLabel("8");

		org.chartistjsf.model.chart.LineChartSeries series1 = new org.chartistjsf.model.chart.LineChartSeries();
		series1.setName("Series 1");

		series1.set(0);
		series1.set(2);
		series1.set(4);

		org.chartistjsf.model.chart.LineChartSeries series2 = new org.chartistjsf.model.chart.LineChartSeries();
		series2.setName("Series 2");

		series2.set(2);
		series2.set(4);
		series2.set(6);
		

		org.chartistjsf.model.chart.Axis xAxis = lineModel2.getAxis(org.chartistjsf.model.chart.AxisType.X);
		lineModel2.addSeries(series1);
		lineModel2.addSeries(series2);;

		lineModel2.setAnimateAdvanced(true);
		lineModel2.setShowTooltip(true);

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

    public void saveThing() {
	thingsList.add(newThing);
	thingsList = new ArrayList<>();
    }

    public Thing getNewThing() {
	return newThing;
    }

    public void setNewThing(Thing newThing) {
	this.newThing = newThing;
    }

    public LineChartModel getLineModel1() {
	return lineModel1;
    }

    public void setLineModel1(LineChartModel lineModel1) {
	this.lineModel1 = lineModel1;
    }

    public org.chartistjsf.model.chart.LineChartModel getLineModel2() {
	return lineModel2;
    }

    public void setLineModel2(org.chartistjsf.model.chart.LineChartModel lineModel2) {
	this.lineModel2 = lineModel2;
    }
    
    

}
