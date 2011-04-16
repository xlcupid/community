package org.neo4j.lab.cypher

import util.parsing.combinator.testing.Number

case class Query(select: Select, from: List[VariableAssignment] = Nil, where: Option[Where] = None)

case class Select(selectItems: SelectItem*)


case class VariableAssignment(variable: String, fromitem: FromItem)





case class Where(clauses: Clause*)

