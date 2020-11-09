import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'dart:math';

class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int _dado1 = 0, _dado2 = 0;

  var _imagems = ["assets/dices/dice1.png", "assets/dices/dice2.png", "assets/dices/dice3.png",
    "assets/dices/dice4.png", "assets/dices/dice5.png", "assets/dices/dice6.png",
    "assets/dices/mustache_face.jpg"];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.blueAccent.shade400,
      appBar: AppBar(title: Text("Rolador de Dados", style: GoogleFonts.pacifico(),),),
      body: Padding(
        padding: const EdgeInsets.all(8.0),
        child: Row(
          children: [
            Expanded(child: Image.asset(_imagems[_dado1])),
            SizedBox(width: 16,),
            Expanded(child: Image.asset(_imagems[_dado2]))
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.font_download),
        onPressed: (){
          setState(() {
            _rolar_dados();
          });
        },
      ),
    );
  }

  void _rolar_dados() {
    _dado1 = (new Random()).nextInt(_imagems.length);
    _dado2 = (new Random()).nextInt(_imagems.length);
    print("Dado 1: ${_imagems[_dado1]}");
    print("Dado 2: ${_imagems[_dado2]}");
  }
}
