/**
 * Copyright 2010-17 Simon Andrews
 *
 *    This file is part of SeqMonk.
 *
 *    SeqMonk is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    SeqMonk is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with SeqMonk; if not, write to the Free Software
 *    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package uk.ac.babraham.SeqMonk.DataTypes.Genome;

import java.io.Serializable;

/**
 * The Class AnnotationTagValue stores a key value pair associated 
 * with an annotation feature
 */
public class AnnotationTagValue implements Serializable{

	/** The tag. */
	private String tag;
	
	/** The value. */
	private String value;
	
	/**
	 * Instantiates a new annotation tag value.
	 * 
	 * @param tag the tag
	 * @param value the value
	 */
	public AnnotationTagValue (String tag, String value) {
		this.tag = tag;
		this.value = value;
	}
	
	/**
	 * Tag.
	 * 
	 * @return the string
	 */
	public String tag () {
		return tag;
	}
	
	/**
	 * Value.
	 * 
	 * @return the string
	 */
	public String value () {
		return value;
	}
	
}
