
package com.groialeonardo.lgportfolio.services;

import java.util.List;


public interface IGeneralService<T> {
    
    public List <T> getAll();
    
    public T create (T exp);
    
    public T update(T exp);
    
    public T delete (Long id);
    
}
