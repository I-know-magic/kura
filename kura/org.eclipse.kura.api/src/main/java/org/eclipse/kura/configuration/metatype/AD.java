/*******************************************************************************
 * Copyright (c) 2011, 2020 Eurotech and/or its affiliates and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Eurotech
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.10.26 at 02:11:54 PM CEST
//

package org.eclipse.kura.configuration.metatype;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * Java class for Tad complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Tad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Option" type="{http://www.osgi.org/xmlns/metatype/v1.2.0}Toption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.osgi.org/xmlns/metatype/v1.2.0}Tscalar" /&gt;
 *       &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;anyAttribute/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @noimplement This interface is not intended to be implemented by clients.
 */
@ProviderType
public interface AD {

    /**
     * Gets the value of the option property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getOption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option }
     *
     *
     */
    public List<Option> getOption();

    /**
     * Gets the value of the name property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getName();

    /**
     * Gets the value of the description property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getDescription();

    /**
     * Gets the value of the id property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getId();

    /**
     * Gets the value of the type property.
     *
     * @return
     *         possible object is
     *         {@link Scalar }
     *
     */
    public Scalar getType();

    /**
     * Gets the value of the cardinality property.
     *
     * @return
     *         possible object is
     *         {@link Integer }
     *
     */
    public int getCardinality();

    /**
     * Gets the value of the min property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getMin();

    /**
     * Gets the value of the max property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getMax();

    /**
     * Gets the value of the default property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getDefault();

    /**
     * Gets the value of the required property.
     *
     * @return
     *         possible object is
     *         {@link Boolean }
     *
     */
    public boolean isRequired();
}
