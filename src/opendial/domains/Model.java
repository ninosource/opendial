// =================================================================                                                                   
// Copyright (C) 2009-2011 Pierre Lison (plison@ifi.uio.no)                                                                            
//                                                                                                                                     
// This library is free software; you can redistribute it and/or                                                                       
// modify it under the terms of the GNU Lesser General Public License                                                                  
// as published by the Free Software Foundation; either version 2.1 of                                                                 
// the License, or (at your option) any later version.                                                                                 
//                                                                                                                                     
// This library is distributed in the hope that it will be useful, but                                                                 
// WITHOUT ANY WARRANTY; without even the implied warranty of                                                                          
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU                                                                    
// Lesser General Public License for more details.                                                                                     
//                                                                                                                                     
// You should have received a copy of the GNU Lesser General Public                                                                    
// License along with this program; if not, write to the Free Software                                                                 
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA                                                                           
// 02111-1307, USA.                                                                                                                    
// =================================================================                                                                   

package opendial.domains;

import java.util.ArrayList;
import java.util.List;

import opendial.domains.Model.Type;
import opendial.domains.rules.Rule;
import opendial.utils.Logger;

/**
 * 
 *
 * @author  Pierre Lison (plison@ifi.uio.no)
 * @version $Date::                      $
 *
 */
public class Model {

	static Logger log = new Logger("Model", Logger.Level.NORMAL);
	
	public static enum Type {
		USER_REALISATION,
		USER_PREDICTION,
		USER_TRANSITION,
		SYSTEM_ACTIONVALUE,
		SYSTEM_REALISATION,
		SYSTEM_TRANSITION
	}
	
	Type type;
	
	List<Rule> rules;
	
	
	public Model(Type type) {
		this.type = type;
		rules = new ArrayList<Rule>();
	}
	
	public void addRule(Rule rule) {
		rules.add(rule);
	}

	/**
	 * 
	 * @return
	 */
	public Type getType() {
		return type;
	}
}
