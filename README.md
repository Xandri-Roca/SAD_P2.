# Pràctica 2
Practiques SAD - Bernat Xandri Zaragoza i Ramon Roca Oliver

En aquesta segona pràctica veiem la implementació plicació Xat textual amb servidor centralitzat. El servidor fa un broadcast dels missatges originats per un client a la resta de clients. Cada client s’identifica per un nick que s’envia al servidor quan aquest es connecta.
El servidor manté un diccionari de parells (nick,socket). Aquest diccionari s'ha implementat mitjançant un HashMap per tal de permetre l'acces en lectura y escriptura.

### Procés d'execució:
Per tal de efr l'execuió, es requereix de 3 terminals:
  - En el primer s'haurà d'executar el fitxer **ServerConnection.java**
