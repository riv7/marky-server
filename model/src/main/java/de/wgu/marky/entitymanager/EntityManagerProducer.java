/*
 * Copyright (c) eXXcellent solutions GmbH 2017.
 * All rights reserved.
 *
 * This file is made available under the terms of the license
 * agreement that accompanies this distribution.
 */

package de.wgu.marky.entitymanager;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Provides am MovieDB EntityManager
 */
@ApplicationScoped
public class EntityManagerProducer {

    @Produces
    @PersistenceContext(unitName = "marky")
    private EntityManager em;

}
