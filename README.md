Case 2 - Smarthus

Selskapet SmartereHus AS har ansatt dere for å designe et webbasert grensesnitt til systemet deres. Grensesnittet skal fungere både på nettbrett og datamaskin (frivillig: og mobiltelefon). For å begrense oppgaven skal grensesnittet dere lager kun gjøre følgende:

    Styre varmen i huset (forskjellige rom kan ha forskjellig temperatur til forskjellige tidspunkter).
    Styre lys, og kunne skru lys av og på til forhåndsbestemte tider på gitte rom.
    Styre lydanlegg/radio i rom det det finnes, og kunne skru dette av og på til forhåndsbestemte tider (f.eks for vekking/innsovning på soverom eller en planlagt fest).
    Systemet skal ha et "live"-panel som viser nå-situasjonen, innstilt temperatur og lys på hvert rom, og om lydanlegget er på.

Dette systemet vil bli markedsført som et system for deg som vil ha enkelhet og luksus i hverdagen, uten å måtte styre med masse tekniske detaljer. Et foreløpig slagord for prosjektet er "Mer chill, mindre dill".
Backend

Lag en backend for valgt case. Dette skal være en REST-server utviklet med JAX-RS.

    Tenk "RESTfully". Bruk enkle GET/POST/PUT/DELETE-operasjoner for valgte entiteter (ressurser).
    Test tjenestene ved å bruker browser for GET, og enten CURL eller en nettleserplugin for POST/PUT/DELETE.
    Dere kan bruke en database i bunnen hvis dere vil, men det er greit at alt lagres i statiske variabler på REST-serveren.
    Dere trenger ikke beskytte REST-tjenestene med autentisering.

Frontend

Lag en enkel frontend for casen.

    Legg vekt på å få opp skjermbilder og funksjonalitet, ikke tenk så mye på utseende
    Bruk jQuery for AJAX-kall mot REST-serveren dere lagde i forrige øving.
    Bruk Bootstrap eller et annet CSS-rammeverk, men som sagt skal dere gjøre GUI'et enkelt.
