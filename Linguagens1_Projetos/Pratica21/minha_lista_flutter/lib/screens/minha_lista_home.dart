import 'package:flutter/material.dart';
import 'package:minha_lista_flutter/models/hero.dart';

class MinhaListaHome extends StatelessWidget {
  final _myHerosList = [MyHero("All Might", "One for All", "https://abridgedseries.com/wp-content/uploads/2018/08/310613.jpg"), MyHero("Midora", "One for All", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSLV14Wx4zF91WZE1LNZ5RAIGP0GrmlV57npA&usqp=CAU"),
    MyHero("Baguko", "Explosão", "https://img.favpng.com/0/5/11/my-hero-academia-eijirou-kirishima-tenya-iida-character-boku-no-hero-academia-smash-png-favpng-3cwat4m5L3Ggp2ntKy51q3BJN.jpg")];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: ListView(
          children: [
            ListTile(title: Text(_myHerosList[0].nome), subtitle: Text(_myHerosList[0].sigularidade),
            leading: Image.network(_myHerosList[0].image),),
            ListTile(title: Text(_myHerosList[1].nome), subtitle: Text(_myHerosList[1].sigularidade),
            leading: Image.network(_myHerosList[1].image),),
            ListTile(title: Text(_myHerosList[2].nome), subtitle: Text(_myHerosList[2].sigularidade),
              leading: Image.network(_myHerosList[2].image),),
          ],
        ),
    );
  }
}

class MinhaListaHome2 extends StatelessWidget {
  final _myHerosList = [MyHero("All Might", "One for All", "https://abridgedseries.com/wp-content/uploads/2018/08/310613.jpg"),
    MyHero("Midora", "One for All", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSLV14Wx4zF91WZE1LNZ5RAIGP0GrmlV57npA&usqp=CAU"),
    MyHero("Baguko", "Explosão", "https://img.favpng.com/0/5/11/my-hero-academia-eijirou-kirishima-tenya-iida-character-boku-no-hero-academia-smash-png-favpng-3cwat4m5L3Ggp2ntKy51q3BJN.jpg"),
    MyHero("Ochako", "Zero Gravity", "https://i.pinimg.com/originals/2d/df/84/2ddf8471ddc8841a4b2ceeb3b5ca61ea.png"),
  ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: ListView.builder(
          itemBuilder: (context, index){
            return ListTile(
              title: Text(_myHerosList[index].nome),
              subtitle: Text(_myHerosList[index].sigularidade),
              leading: Image.network(_myHerosList[index].image),
            );
          },
          itemCount: _myHerosList.length,
      )
    );
  }
}

class MinhaListaHome3 extends StatefulWidget {
  @override
  _MinhaListaHome3State createState() => _MinhaListaHome3State();
}

class _MinhaListaHome3State extends State<MinhaListaHome3> {
  final _myHerosList = [MyHero("All Might", "One for All", "https://abridgedseries.com/wp-content/uploads/2018/08/310613.jpg"),
    MyHero("Midora", "One for All", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSLV14Wx4zF91WZE1LNZ5RAIGP0GrmlV57npA&usqp=CAU"),
    MyHero("Baguko", "Explosão", "https://img.favpng.com/0/5/11/my-hero-academia-eijirou-kirishima-tenya-iida-character-boku-no-hero-academia-smash-png-favpng-3cwat4m5L3Ggp2ntKy51q3BJN.jpg"),
    MyHero("Ochako", "Zero Gravity", "https://i.pinimg.com/originals/2d/df/84/2ddf8471ddc8841a4b2ceeb3b5ca61ea.png"),
  ];

  final controladorNome = TextEditingController();

  final controladorSingularidade = TextEditingController();

  final controladorUrlImage = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
          body: Column(
            children: [
              SizedBox(width:200, height: 100,child: Image.network("https://upload.wikimedia.org/wikipedia/commons/c/cf/Boku_no_Hero_Academia_Logo.png")),
              meuTextFieldPersonalizado(controladorNome, "Informe o nome do heroi", "Nome:", Icon(Icons.drive_file_rename_outline)),
              meuTextFieldPersonalizado(controladorSingularidade, "Informe a singularidade do heroi", "Singularidade:", Icon(Icons.ac_unit_outlined)),
              meuTextFieldPersonalizado(controladorUrlImage, "Informe a URL da imagem do heroi", "URL Imagem:", Icon(Icons.image)),
              FlatButton(onPressed: (){
                adicionar_novo_registro();
              }, child: Text("Adicionar")),
              Expanded(
                child: ListView.builder(
                  itemBuilder: (context, index){
                    return ListTile(
                      title: Text(_myHerosList[index].nome),
                      subtitle: Text(_myHerosList[index].sigularidade),
                      leading: Image.network(_myHerosList[index].image),
                    );
                  },
                  itemCount: _myHerosList.length,
                ),
              )
            ],
          )

      ),
    );
  }

  Widget meuTextFieldPersonalizado(TextEditingController controlador, String hint, String label, Icon icone) {
    return Padding(
              padding: const EdgeInsets.all(8.0),
              child: TextField(controller: controlador, decoration: InputDecoration(
                hintText: hint,
                labelText: label,
                icon: icone
              ),),
            );
  }

  void adicionar_novo_registro() {
    setState(() {
      _myHerosList.add(MyHero(controladorNome.text, controladorSingularidade.text, controladorUrlImage.text));
      print(_myHerosList);
    });
  }
}