/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.smarttasks.uihelper.configuration.saxhandler;

import com.wordpress.salaboy.smarttasks.uihelper.configuration.UIHelperConfiguration;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 * Handler used to parse all the tags belonging to a particular uri in
 * UIHelper configuration file.
 * @author esteban
 */
public interface UIHelperConfigurationUriHandler {
    String getURI();
    
    /**
     * 
     * @param tagName
     * @param attributes
     * @param configuration
     * @throws SAXException 
     */
    void startElement(String tagName, Attributes attributes, UIHelperConfiguration configuration ) throws SAXException;
}
