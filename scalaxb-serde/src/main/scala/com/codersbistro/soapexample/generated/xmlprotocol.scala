// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package com.codersbistro.soapexample.generated

import com.codersbistro.soapexample.generated


/**
*usage:
*val obj = scalaxb.fromXML[com.codersbistro.soapexample.gen.Foo](node)
*val document = scalaxb.toXML[com.codersbistro.soapexample.gen.Foo](obj, "foo", com.codersbistro.soapexample.gen.defaultScope)
**/
object `package` extends XMLProtocol { }

trait XMLProtocol extends scalaxb.XMLStandardTypes {
  implicit lazy val executionContext = scala.concurrent.ExecutionContext.Implicits.global

  val defaultScope = scalaxb.toScope(None -> "http://www.example.com/IPO",
    Some("ipo") -> "http://www.example.com/IPO",
    Some("xs") -> "http://www.w3.org/2001/XMLSchema",
    Some("xsi") -> "http://www.w3.org/2001/XMLSchema-instance")
  implicit lazy val Comcodersbistrosoapexamplegen_AddressableFormat: scalaxb.XMLFormat[Addressable] = new DefaultComcodersbistrosoapexamplegen_AddressableFormat {}
  implicit lazy val Comcodersbistrosoapexamplegen_AddressFormat: scalaxb.XMLFormat[Address] = new DefaultComcodersbistrosoapexamplegen_AddressFormat {}
  implicit lazy val Comcodersbistrosoapexamplegen_USAddressFormat: scalaxb.XMLFormat[USAddress] = new DefaultComcodersbistrosoapexamplegen_USAddressFormat {}


  implicit val fromAnySchemaType: scala.xml.Elem => Option[scalaxb.DataRecord[Any]] = {elem =>
    import scalaxb.Helper

    val ns = Helper.nullOrEmpty(elem.scope.getURI(elem.prefix))
    val key = Some(elem.label)
    val (xsns, xstype) = Helper.instanceType(elem)

    (key, ns) match {

      case _ => None
    }
  }

  trait DefaultComcodersbistrosoapexamplegen_AddressableFormat extends scalaxb.XMLFormat[Addressable] {
    def reads(seq: scala.xml.NodeSeq, stack: List[scalaxb.ElemName]): Either[String, Addressable] = seq match {
      case node: scala.xml.Node =>     
        scalaxb.Helper.instanceType(node) match {
          case (Some("http://www.example.com/IPO"), Some("USAddress")) => Right(scalaxb.fromXML[USAddress](node, stack))
          case _ => Right(scalaxb.fromXML[Address](node, stack))
        }
      case _ => Left("reads failed: seq must be scala.xml.Node")  
    }
    
    def writes(__obj: Addressable, __namespace: Option[String], __elementLabel: Option[String],
               __scope: scala.xml.NamespaceBinding, __typeAttribute: Boolean): scala.xml.NodeSeq = __obj match {
      case x: USAddress => scalaxb.toXML[USAddress](x, __namespace, __elementLabel, __scope, true)
      case x: Address => scalaxb.toXML[Address](x, __namespace, __elementLabel, __scope, false)
    }
  }

  trait DefaultComcodersbistrosoapexamplegen_AddressFormat extends scalaxb.ElemNameParser[Address] {
    val targetNamespace: Option[String] = Some("http://www.example.com/IPO")
    
    override def typeName: Option[String] = Some("Address")

    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[Address] =
      phrase((scalaxb.ElemName(Some("http://www.example.com/IPO"), "name")) ~ 
      (scalaxb.ElemName(Some("http://www.example.com/IPO"), "street")) ~ 
      (scalaxb.ElemName(Some("http://www.example.com/IPO"), "city")) ^^
      { case p1 ~ p2 ~ p3 =>
        generated.Address(scalaxb.fromXML[String](p1, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p2, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p3, scalaxb.ElemName(node) :: stack)) })
    
    def writesChildNodes(__obj: Address, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq.concat(scalaxb.toXML[String](__obj.name, Some("http://www.example.com/IPO"), Some("name"), __scope, false),
        scalaxb.toXML[String](__obj.street, Some("http://www.example.com/IPO"), Some("street"), __scope, false),
        scalaxb.toXML[String](__obj.city, Some("http://www.example.com/IPO"), Some("city"), __scope, false))

  }

  trait DefaultComcodersbistrosoapexamplegen_USAddressFormat extends scalaxb.ElemNameParser[USAddress] {
    val targetNamespace: Option[String] = Some("http://www.example.com/IPO")
    
    override def typeName: Option[String] = Some("USAddress")

    def parser(node: scala.xml.Node, stack: List[scalaxb.ElemName]): Parser[USAddress] =
      phrase((scalaxb.ElemName(Some("http://www.example.com/IPO"), "name")) ~ 
      (scalaxb.ElemName(Some("http://www.example.com/IPO"), "street")) ~ 
      (scalaxb.ElemName(Some("http://www.example.com/IPO"), "city")) ~ 
      (scalaxb.ElemName(Some("http://www.example.com/IPO"), "state")) ~ 
      (scalaxb.ElemName(Some("http://www.example.com/IPO"), "zip")) ^^
      { case p1 ~ p2 ~ p3 ~ p4 ~ p5 =>
        generated.USAddress(scalaxb.fromXML[String](p1, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p2, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p3, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[String](p4, scalaxb.ElemName(node) :: stack),
        scalaxb.fromXML[BigInt](p5, scalaxb.ElemName(node) :: stack)) })
    
    def writesChildNodes(__obj: USAddress, __scope: scala.xml.NamespaceBinding): Seq[scala.xml.Node] =
      Seq.concat(scalaxb.toXML[String](__obj.name, Some("http://www.example.com/IPO"), Some("name"), __scope, false),
        scalaxb.toXML[String](__obj.street, Some("http://www.example.com/IPO"), Some("street"), __scope, false),
        scalaxb.toXML[String](__obj.city, Some("http://www.example.com/IPO"), Some("city"), __scope, false),
        scalaxb.toXML[String](__obj.state, Some("http://www.example.com/IPO"), Some("state"), __scope, false),
        scalaxb.toXML[BigInt](__obj.zip, Some("http://www.example.com/IPO"), Some("zip"), __scope, false))

  }


}
