package com.proyecto.util;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;

import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.proyecto.entity.Curso;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

public class ListarClientesPdf {

    public void generate(List< Curso> cursos, HttpServletResponse response) throws DocumentException, IOException {
        // Creating the Object of Document
        Document document = new Document(PageSize.A4);
        // Getting instance of PdfWriter
        PdfWriter.getInstance(document, response.getOutputStream());

        // Opening the created document to change it
        document.open();
        // Creating font
        // Setting font style and size
        Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTiltle.setSize(12);
        fontTiltle.setColor(CMYKColor.BLUE);
        for (Curso curso : cursos) {

            Image jpg = Image.getInstance("src/main/resources/Imagenes/Maquinas/Cabecera.jpg");
            jpg.setAlignment(Element.ALIGN_CENTER);
            jpg.setSpacingAfter(1);
            jpg.setSpacingBefore(0);
            jpg.setIndentationLeft(1);
            jpg.setIndentationRight(1);
            jpg.scaleAbsolute(500, 110);

            Image foto2 = Image.getInstance("src/main/resources/Imagenes/Maquinas/piedepagina.jpg");
            foto2.scaleAbsolute(550, 100);
            foto2.setAlignment(Element.ALIGN_CENTER);
            foto2.setAbsolutePosition(20, (float) (PageSize.A4.getHeight() - 820.0));
            //////////////////////////MODELOS DE MAQUINAS///////////////////
            Image Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/Cabecera.jpg");
            if ("C220".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/bizhubc220.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 100);
            }
            if ("C280".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c280.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 100);
                Modelos.scaleAbsolute(550, 250);
            }
            if ("C360".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c360.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);

            }
            if ("C224e".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/224.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C284e".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c284e.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C364e".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c364e.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C454e".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c454e.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);
                

            }
            if ("C554e".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c554.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C308".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c308.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C368".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c368.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C458".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c458.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("C558".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/c558.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("Bizhub4020".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/4020.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(532, 246);

            }
            if ("Bizhub4050".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/4050.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(532, 246);

            }
            if ("HPA3".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/hpp77940.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 100);
            }
            if ("HPA4".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/hpe87650.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("bizhub227".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/227.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("bizhub287".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/287.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("bizhub367".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/367.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("SindohD311".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/D310_311.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("SindohD310".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/D310_311.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }
            if ("SindohD412".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/D412.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);
                Modelos.scaleAbsolute(550, 250);
                

            }
            if ("SindohD410".equals(curso.getDescripcion())) {
                Modelos = Image.getInstance("src/main/resources/Imagenes/Maquinas/D410.jpg");
                Modelos.setAlignment(Element.ALIGN_CENTER);
                Modelos.setSpacingAfter(1);
                Modelos.setSpacingBefore(1);
                Modelos.setIndentationRight(1);
                Modelos.scaleAbsolute(550, 250);

            }

            //////////////FECHA/////////////////////
            Calendar cal = Calendar.getInstance();
            Date fecha = new Date(cal.getTimeInMillis());
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph paragraphfecha = new Paragraph();
            paragraphfecha.setAlignment(Element.ALIGN_CENTER);
            paragraphfecha.setSpacingAfter(1);
            paragraphfecha.setSpacingBefore(1);

            //paragraphfecha.setIndentationLeft(1);
            // paragraphfecha.setIndentationRight(1);
            Font fontFecha = FontFactory.getFont(FontFactory.TIMES_ROMAN);
            fontFecha.setSize(9);
            Chunk chunkfecha = new Chunk("Documento cerrado a fecha   " + formato.format(fecha) + "", fontFecha);

            paragraphfecha.add(chunkfecha);
            /////////////////////////////////PROPUESTA ECONOMICA/////////////////////
            Paragraph paragraph2 = new Paragraph();

            paragraph2.setSpacingAfter(5);
            paragraph2.setSpacingBefore(1);
            paragraph2.setAlignment(Element.ALIGN_CENTER);
            paragraph2.setIndentationLeft(50);
            paragraph2.setIndentationRight(50);

            Chunk chunk = new Chunk("Propuesta economica"); //NOI18N
            paragraph2.add(chunk);
            Paragraph paragraph1 = new Paragraph("Presupuesto exclusivo para  " + curso.getNombre(), fontTiltle);
            paragraph1.setAlignment(Paragraph.ALIGN_CENTER);

            /////////////////////////////////TABLA PRIMERA//////////////////////
            PdfPTable table = new PdfPTable(2);
            PdfPCell cell = new PdfPCell();
            table.setWidths(new int[]{2, 2});
            table.setSpacingBefore(1);
            cell.setBackgroundColor(Color.LIGHT_GRAY);
            cell.setPadding(2);
            Font fontTablaUno = FontFactory.getFont(FontFactory.TIMES_ROMAN);
            // fontTablaUno.setColor(CMYKColor.WHITE);
            fontTablaUno.setSize(9);
            cell.setPhrase(new Phrase("Precio de la máquina", fontTablaUno));
            table.addCell(cell);
            cell.setPhrase(new Phrase(curso.getPrecio() + " €", fontTablaUno));
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(cell);

            if (curso.getDesNuevoCliente().isEmpty() && curso.getDesRecompra().isEmpty()) {

            } else if (curso.getDesRecompra().isEmpty()) {
                cell.setPhrase(new Phrase("Descuento por nuevo cliente", fontTablaUno));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                table.addCell(cell);
                cell.setPhrase(new Phrase(curso.getDesNuevoCliente() + " €", fontTablaUno));
                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                table.addCell(cell);
            } else if (curso.getDesNuevoCliente().isEmpty()) {
                cell.setPhrase(new Phrase("Descuento por recompra", fontTablaUno));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                table.addCell(cell);
                cell.setPhrase(new Phrase(curso.getDesRecompra() + " €", fontTablaUno));
                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                table.addCell(cell);

            }

            ///////////////////////////TABLA RENTING O ALQUILER/////////////////////////
            PdfPTable TablaRenting = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell();
            TablaRenting.setWidths(new int[]{3, 3, 3});
            TablaRenting.setSpacingBefore(1);
            cell1.setBackgroundColor(Color.LIGHT_GRAY);
            cell1.setPadding(2);
            cell1.setPaddingBottom(4);
            Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
            font.setSize(9);
            if (curso.getRenting().isEmpty()) {
                cell1.setPhrase(new Phrase("La máquina se pagará ", font));
                TablaRenting.addCell(cell1);
                cell1.setPhrase(new Phrase("al contado la cantidad de " , font));
                TablaRenting.addCell(cell1);
                cell1.setPhrase(new Phrase(curso.getPrecio() + " €", font));
                cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                TablaRenting.addCell(cell1);
            } else  {
                cell1.setPhrase(new Phrase(curso.getRenting(), font));
                TablaRenting.addCell(cell1);
                cell1.setPhrase(new Phrase(curso.getMeses() + " Meses", font));
                cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                TablaRenting.addCell(cell1);
                cell1.setPhrase(new Phrase(curso.getPvpRent() + " €/mes", font));
                cell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                TablaRenting.addCell(cell1);
            }
////////////////////////TABLA DESCUENTOS////////////////////////////////////////
            PdfPTable tablaDescuentos = new PdfPTable(2);
            PdfPCell cell2 = new PdfPCell();
            tablaDescuentos.setWidths(new int[]{3, 3});
            tablaDescuentos.setSpacingBefore(1);
            cell2.setBackgroundColor(Color.LIGHT_GRAY);
            cell2.setPadding(2);
            cell2.setPaddingBottom(4);
            if (curso.getDescuento1().isEmpty() && curso.getDescuento2().isEmpty() && curso.getDescuento3().isEmpty()) {
            } else if (curso.getDescuento2().isEmpty() && curso.getDescuento3().isEmpty()) {
                cell2.setPhrase(new Phrase(curso.getDescuento1(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getPrecio1(), font));
                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaDescuentos.addCell(cell2);
            } else if (curso.getDescuento3().isEmpty()) {
                cell2.setPhrase(new Phrase(curso.getDescuento1(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getPrecio1(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getDescuento2(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getPrecio2(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaDescuentos.addCell(cell2);

            } else {
                cell2.setPhrase(new Phrase(curso.getDescuento1(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getPrecio1(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getDescuento2(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getPrecio2(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getDescuento3(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
                tablaDescuentos.addCell(cell2);
                cell2.setPhrase(new Phrase(curso.getPrecio3(), font));
                cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tablaDescuentos.addCell(cell2);

            }
            //////////////////// TABLA PRECIO DE COPIAS Y TOTAL////////////////////////////
            PdfPTable TablaCopias = new PdfPTable(2);
            PdfPCell cellCopias = new PdfPCell();
            TablaCopias.setWidths(new int[]{3, 3});
            TablaCopias.setSpacingBefore(1);
            Color color = new Color(25, 188, 188);
            cellCopias.setBackgroundColor(Color.LIGHT_GRAY);
            cellCopias.setPadding(2);
            cellCopias.setPaddingBottom(4);
            cellCopias.setPhrase(new Phrase("Total ", font));
            cellCopias.setHorizontalAlignment(Element.ALIGN_LEFT);
            tablaDescuentos.addCell(cellCopias);
            cellCopias.setPhrase(new Phrase(curso.getPrecioMaquina() + " €", font));
            cellCopias.setHorizontalAlignment(Element.ALIGN_RIGHT);
            tablaDescuentos.addCell(cellCopias);
            cellCopias.setPhrase(new Phrase("Precio por copia en Negro", font));
             cellCopias.setHorizontalAlignment(Element.ALIGN_LEFT);
            tablaDescuentos.addCell(cellCopias);
            cellCopias.setPhrase(new Phrase(curso.getCopiaNegro() + " €", font));
            cellCopias.setHorizontalAlignment(Element.ALIGN_RIGHT);
            tablaDescuentos.addCell(cellCopias);
            cellCopias.setPhrase(new Phrase("Precio por copia en Color", font));
             cellCopias.setHorizontalAlignment(Element.ALIGN_LEFT);
            tablaDescuentos.addCell(cellCopias);
            cellCopias.setPhrase(new Phrase(curso.getCopiaColor() + " €", font));
            cellCopias.setHorizontalAlignment(Element.ALIGN_RIGHT);
            tablaDescuentos.addCell(cellCopias);
///////////////////////////Parrafo de garantia/////////////////////////////
            Font garantia = FontFactory.getFont(FontFactory.TIMES_ROMAN);
            garantia.setSize(9);
            garantia.setColor(47, 214, 217);
            Paragraph PGarantia = new Paragraph("El precio del mantenimiento incluye consumibles, piezas, reparaciones y desplazamiento del tecnico por un plazo de la validez del contrato", garantia);
            PGarantia.setAlignment(Paragraph.ALIGN_CENTER);
/////////////////////////////////////////////////////////////////////////

            document.add(jpg);
            document.add(paragraph1);
            document.add(Modelos);
            document.add(paragraph2);
            document.add(table);
            document.add(TablaRenting);
            document.add(tablaDescuentos);
            document.add(TablaCopias);
            document.add(PGarantia);
           // document.add(paragraphfecha);
            document.add(foto2);
            document.add(paragraphfecha);

            // Closing the document
            document.close();
        }
    }

}
