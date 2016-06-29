/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bootsfacesissues;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Mirco
 */
@Named
@SessionScoped
public class NavigationBean implements Serializable {

    private String firstPage;
    private String secondPage;
    
    public NavigationBean() {
    }
    
    @PostConstruct
    private void init() {
	this.firstPage = "firstPage.xhtml";
	this.secondPage = "dashboardOverview.xhtml";
    }

    public String getFirstPage() {
	return firstPage;
    }

    public void setFirstPage(String fistPage) {
	this.firstPage = fistPage;
    }

    public String getSecondPage() {
	return secondPage;
    }

    public void setSecondPage(String secondPage) {
	this.secondPage = secondPage;
    }
      
}
