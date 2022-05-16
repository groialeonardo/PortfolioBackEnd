
package com.groialeonardo.lgportfolio.DTO;

public class UsuarioDTO {
    
        private Long Id;
        private String username;
        private String password;
        private String status; 
//prueba        



	public UsuarioDTO(String status) {
		this.status = status;              
                
	}

        public Long getId() {
            return Id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
        
        
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
