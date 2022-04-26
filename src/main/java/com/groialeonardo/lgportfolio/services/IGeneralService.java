
package com.groialeonardo.lgportfolio.services;

import java.util.List;


public interface IGeneralService<T> {
    
    public List <T> getAll();
    
    public T create (T gen);
    
    public T update(T gen);
    
    public T delete (Long id);
    
}
