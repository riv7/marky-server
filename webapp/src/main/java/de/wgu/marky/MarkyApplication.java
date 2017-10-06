package de.wgu.marky;

/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

import de.wgu.marky.stammdaten.year.rest.YearApiImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/api")
@Produces("application/json")
public class MarkyApplication extends Application {

    /**
     * Register all classes that should be mounted to a http route here
     * @return Set of classes to look for webservice annotations
     */
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> services = new HashSet<>();
        services.add(YearApiImpl.class);
        return services;
    }

//    @Override
//    public Set<Object> getSingletons() {
//        Set<Object> singletons = new HashSet<>();
//        singletons.add(new CORSFilter());
//
//        return singletons;
//    }

}

