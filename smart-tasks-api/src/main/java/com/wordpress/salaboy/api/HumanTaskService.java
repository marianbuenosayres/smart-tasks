/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.api;

import java.util.Map;

/**
 *
 * @author salaboy
 */
public interface HumanTaskService extends HumanTaskServiceOperations {
    
    public Map<String, HumanTaskServiceOperations> getTaskOperations();
    
}
