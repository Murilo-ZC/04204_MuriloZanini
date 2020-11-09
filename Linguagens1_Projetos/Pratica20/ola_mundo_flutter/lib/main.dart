import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MinhaTela(),
    );
  }
}

class MinhaTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Meu App Flutter"),),
      body: Column(
        children: [
          Text("Ola eu sou o Goku!"),
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Image.network("https://www.einerd.com.br/wp-content/uploads/2018/08/oi-eu-sou-o-goku-capa-890x466.jpg"),
          ),
          Expanded(
            child: Row(
              children: [
                Expanded(child: Image.network("https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png",
                    fit:BoxFit.contain)),
                Expanded(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      _minha_linha_personalizada("https://assets.pokemon.com/assets/cms2/img/pokedex/full/155.png", "Murilo Zanini de Carvalho"),
                      _minha_linha_personalizada("https://assets.pokemon.com/assets/cms2/img/pokedex/full/152.png","https://github.com/Murilo-ZC/04204_MuriloZanini")
                    ],
                  ),
                )
              ],
            ),
          ),
          Expanded(child: Image.asset("assets/qr-code.png"))
          
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          print("Ola Devs!!");
        },
        child: Icon(Icons.accessibility_sharp),
      ),
    );
  }

  _minha_linha_personalizada(String url_imagem, String texto) {
    return Row(
      children: [
        Expanded(child: Image.network(url_imagem, fit:BoxFit.contain)),
        Expanded(child: Text(texto))
      ],
    );
  }
}


