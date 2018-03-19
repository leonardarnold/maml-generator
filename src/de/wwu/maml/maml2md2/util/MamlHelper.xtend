package de.wwu.maml.maml2md2.util

import de.wwu.maml.dsl.mamldata.DataType
import de.wwu.maml.dsl.mamldata.Collection
import de.wwu.maml.dsl.mamldata.CustomType
import de.wwu.maml.dsl.mamldata.AnonymousType
import de.wwu.maml.dsl.maml.InteractionProcessElement

class MamlHelper {
	
	static def String getDataTypeName(DataType type) {
		switch type {
			Collection: return getDataTypeName(type.type) + "Coll"
			AnonymousType: return "Anonymous" + type.hashCode
			CustomType: return type.name
			de.wwu.maml.dsl.mamldata.Enum: return type.name
			default: return null
		}
	}
	
	static def String getViewName(InteractionProcessElement ipe){
		ipe.description?.getAllowedAttributeName.toFirstUpper + "View"
	}
	
	static def String getWorkflowElementName(InteractionProcessElement ipe){
		ipe.description?.getAllowedAttributeName.toFirstUpper + "WorkflowElement"
	}
	
	static def String getAllowedAttributeName(String text){
		// Replace umlauts
		var out = text.replaceAll("Ä", "Ae");
		out = out.replaceAll("Ö", "Oe");
		out = out.replaceAll("Ü", "Ue");
		out = out.replaceAll("ä", "ae");
		out = out.replaceAll("ö", "oe");
		out = out.replaceAll("ü", "ue");
		out = out.replaceAll("ß", "ss");
		
		// Only alphabetic characters in front
		if(!text.matches("[a-zA-Z].*")){
			return if(out.length() == 1) { "" } else { getAllowedAttributeName(text.substring(1)) };
		}

		// Replace spaces by camel cased name (and trim)
		if(text.contains(" ")){
			val parts = text.split(" ");
			out = "";
			for(String part : parts){
				out += part.toFirstUpper;
			}
		}
		
		// Filter only allowed characters and replace by camel cased name 
		// At the same time trim trailing spaces
		var filteredText = "";
		var nextUpper = false;
		for(char c : text.toCharArray()){
			if((c + "").matches("[a-zA-Z0-9_\\-]")) {
				filteredText += if(nextUpper) { (c + "").toUpperCase() } else { c };
				nextUpper = false;
			} else {
				nextUpper = true;
			}
		}
		
		// First character lowercase
		return filteredText.toFirstLower;
	}
}