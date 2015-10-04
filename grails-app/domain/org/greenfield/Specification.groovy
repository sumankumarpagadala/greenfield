package org.greenfield

class Specification {

	String name
	String searchName
	
	Date dateCreated
	Date lastUpdated

    SortedSet specificationOptions

	static hasMany = [ specificationOptions: SpecificationOption, catalogs: Catalog ]
	
	static mapping = {
		sort name: "asc"
	}

	static constraints = {
		name(nullable:false)
		id generator: 'sequence', params:[sequence:'ID_SPECIFICATION_PK_SEQ']
    }
	
}