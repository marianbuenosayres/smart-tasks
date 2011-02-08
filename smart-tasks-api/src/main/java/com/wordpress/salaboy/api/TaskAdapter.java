/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.api;

import java.util.List;

/**
 *
 * @author salaboy
 */
public interface TaskAdapter<T,U> {
    public List<T> adaptCollection(List<U> vendorTasks);
    public T adapt(U vendorTask);
}
