# Pràctica 2
Practiques SAD - Bernat Xandri Zaragoza i Ramon Roca Oliver

En aquesta segona pràctica veiem la implementació plicació Xat textual amb servidor centralitzat. El servidor fa un broadcast dels missatges originats per un client a la resta de clients. Cada client s’identifica per un nick que s’envia al servidor quan aquest es connecta.
El servidor manté un diccionari de parells (nick,socket). Aquest diccionari s'ha implementat mitjançant un HashMap per tal de permetre l'acces en lectura y escriptura.

### Procés d'execució:
Per tal de efr l'execuió, es requereix de 3 terminals:
  - En el primer s'haurà d'executar el fitxer **ServerConnection.java**. Un cop executat, veurem que apareix el missatge:
  ```
  Initialized server. Waiting for users.
  ```
   
   Així es com el servidor en sindicia que está en l'estat d'escolta.
   
   - En un segon terminal, s'haurà d'executar el fitxer **ClientConnection.java**. Un cop executat veurem que el servidor ens envia un missatge dient:
  ```
  Enter your nick for this chat: 
  ```
   
   Aquí es on l'usuari haurà de decidir el seu nick amb el qual serà identificat pel servidor. Un cop introduit, veurem que en el servidor apareix:
   ```
   New User <NICK> joined the chat.
   ```
   
   - En un tercer terminal s'haurà d'executar de nou el fitxer **ClientConnection.java**. Un cop executat i loggejats amb el nick decidit, veiem que ja podem comunicar-nos entre els diferents clients conectats al servidor.
   
   - En cas de que algun dels clients abandoni el chat, veurem el seguent missatge: 
   ```
   <NICK> left the chat.
   ```
