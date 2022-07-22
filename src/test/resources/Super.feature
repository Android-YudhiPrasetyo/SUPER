Feature: Google Search

  Scenario: Verify user can search on google page
    Given user open google page
    When user input keyword "Pikachu Wikipedia Indonesia" on google page
    And user click button google search
    Then user see description "Pikachu (ピカチュウ) adalah Pokémon utama Ash Ketchum. Pokémon ini adalah semacam pika berwarna kuning dan memiliki ciri ciri kuping mirip kelinci. Dia punya keistimewaan kekuatan tenaga listrik. Pikachu bisa ditemukan di hutan, ladang dan tempat-tempat sumber tenaga listrik."