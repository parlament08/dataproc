package practice2;

import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.util.ArrayList;

public class Deserial {

    public static void main(String[] args) throws IOException {

        XStream xstream = new XStream();
        xstream.processAnnotations(ValCurs.class);
        xstream.processAnnotations(Valute.class);

        ArrayList listDates = GetDates.GetDatesFromTxt();
        ValCurs valCurs = null;

        for (Object list : listDates) {

            String xml = NetClientGet.GetListCurrencies(list);
            valCurs = (ValCurs) xstream.fromXML(xml);

            ApachePOIExcelWrite.PoiWrite(valCurs);

        }
    }
}
