
package com.proyecto.web.util;

import java.util.ResourceBundle;
public class PropertiesUntil {
    public static String getPropiedad(String clave){
        
        ResourceBundle rb= ResourceBundle.getBundle("com.proyecto.web.dao.config-db");
        
        return rb.getString(clave);
                        
    }
}
