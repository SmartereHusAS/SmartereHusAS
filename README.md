# Case 2 - Smarthus
Selskapet SmartereHus AS har ansatt dere for å designe et webbasert grensesnitt til systemet deres. Grensesnittet skal fungere både på nettbrett og datamaskin (frivillig: og mobiltelefon). For å begrense oppgaven skal grensesnittet dere lager kun gjøre følgende:

- Styre varmen i huset (forskjellige rom kan ha forskjellig temperatur til forskjellige tidspunkter).
- Styre lys, og kunne skru lys av og på til forhåndsbestemte tider på gitte rom.
- Styre lydanlegg/radio i rom det det finnes, og kunne skru dette av og på til forhåndsbestemte tider (f.eks for vekking/innsovning på soverom eller en planlagt fest).
- Systemet skal ha et "live"-panel som viser nå-situasjonen, innstilt temperatur og lys på hvert rom, og om lydanlegget er på.

Dette systemet vil bli markedsført som et system for deg som vil ha enkelhet og luksus i hverdagen, uten å måtte styre med masse tekniske detaljer. Et foreløpig slagord for prosjektet er "Mer chill, mindre dill".

# Backend
Lag en backend for valgt case. Dette skal være en REST-server utviklet med JAX-RS.

- Tenk "RESTfully". Bruk enkle GET/POST/PUT/DELETE-operasjoner for valgte entiteter (ressurser).
- Test tjenestene ved å bruker browser for GET, og enten CURL eller en nettleserplugin for POST/PUT/DELETE.
- Dere kan bruke en database i bunnen hvis dere vil, men det er greit at alt lagres i statiske variabler på REST-serveren.
- Dere trenger ikke beskytte REST-tjenestene med autentisering.

# Frontend
Lag en enkel frontend for casen.

- Legg vekt på å få opp skjermbilder og funksjonalitet, ikke tenk så mye på utseende
- Bruk jQuery for AJAX-kall mot REST-serveren dere lagde i forrige øving.
- Bruk Bootstrap eller et annet CSS-rammeverk, men som sagt skal dere gjøre GUI'et enkelt.
- 
#Case 7

a)

I denne deloppgaven skal dere ikke tenke så mye konkret på hva dere allerede har laget, men heller prøve å tenke på caset som om dere skulle begynt fra skrætsj. Prøv å være litt ambisiøs på systemet sine vegne:

- Elsykkelutleie: Hvorfor skal brukerne få lyst til å prøve, og deretter komme tilbake og fortsette å bruke det?
- Smarthus: Smarthussystem er en stor investering, så brukerne trenger å følge seg trygge på at akkurat dere er det perfekte valget før de blar opp. Så hvorfor velge dere blant alle konkurrentene?

Definer målgruppen for systemet dere lager og beskriv brukeropplevelsen dere ønsker de skal ha når de bruker det (se hvordan brukeropplevelsen er beskrevet i leksjonen, ta utgangspunkt i det). Bestem også hva dere mener er de viktigste elementene av brukskvalitet og universell utforming for systemet deres (dette kan tenkes på som en del av brukeropplevelsen).
 

b)

Gå gjennom brukergrensesnittet dere har laget i Øving 6 (skjermbilde for skjermbilde), og kommenter på hvert av dem mhp.

- de fem punktene for brukskvalitet,
- de sju punktene for universell utforming og
- brukeropplevelsen.

Legg spesielt vekt på det dere kom fram til i deloppgave a). Foreslå så minst tre forbedringspunkter for hvert skjermbilde og implementer dem. Har dere mange skjermbilder skal dere gå gjennom alle, men dere trenger ikke å implementere endringer for mer enn fire av dem.) 

 

c)

Lag en brukertest for det redesignede systemet deres. Dere bør gjennomføre testen på minst 3 personer som ikke er med i gruppa (og helst ikke i en annen gruppe med samme case). Dere skal lage

- en plan for hvordan testen skal gjennomføres (fysiske omgivelser, teknologi, oppgaver som skal løses mm.),
- en beskrivelse av resultatene, og
- forslag til endringer av brukergrensesnittet basert på resultatene.

(Disse endringene trenger dere ikke å implementere, men ta vare på dem til neste øving da vi skal jobbe videre med GUIet.)

 
