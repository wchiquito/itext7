/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2023 Apryse Group NV
    Authors: Apryse Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.io.util;

import com.itextpdf.test.ExtendedITextTest;
import com.itextpdf.test.annotations.type.UnitTest;
// Android-Conversion-Skip-Line (Directly use xerces library to unify behavior with vanilla java (where xerces is implemented into JRE))
// Android-Conversion-Replace import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
// Android-Conversion-Replace import org.apache.xerces.jaxp.SAXParserFactoryImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;

@Category(UnitTest.class)
public class XmlUtilTest extends ExtendedITextTest {

    @Test
    public void initNewXmlDocumentTest() throws Exception {
        Document doc = XmlUtil.initNewXmlDocument();
        Assert.assertNotNull(doc);
    }

    @Test
    public void getDocumentBuilderFactoryTest() {
        DocumentBuilderFactory factory = XmlUtil.getDocumentBuilderFactory();

        // Android-Conversion-Skip-Line (Directly use xerces library to unify behavior with vanilla java (where xerces is implemented into JRE))
        Assert.assertEquals(DocumentBuilderFactory.newInstance().getClass(), factory.getClass()); // Android-Conversion-Replace Assert.assertEquals(DocumentBuilderFactoryImpl.class, factory.getClass());
    }

    @Test
    public void createSAXParserFactoryTest() {
        SAXParserFactory factory = XmlUtil.createSAXParserFactory();

        // Android-Conversion-Skip-Line (Directly use xerces library to unify behavior with vanilla java (where xerces is implemented into JRE))
        Assert.assertEquals(SAXParserFactory.newInstance().getClass(), factory.getClass()); // Android-Conversion-Replace Assert.assertEquals(SAXParserFactoryImpl.class, factory.getClass());
    }
}
