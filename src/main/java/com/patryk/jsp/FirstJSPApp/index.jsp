<%@ page import="java.util.Date" %>

<html>
    <head>
        <title>
            Stronka zupełnie testowa
        </title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <p class="akapit-zwykly">
            akapit totalnie testowy
        </p>
        
        <div id="identyfikator-diva">

            <p class="akapit-w-divie">
                akapit totalnie testowy
            </p>
                <% for (int licznik = 0; licznik < 10; licznik++) { %>
                    <p class="akapit-w-divie">
                    Napis po raz <%= licznik %><br>
                    </p>
                <% } %>


            <p>
                Godzina <%= new Date() %>
            </p>
        </div>

    </body>
</html>