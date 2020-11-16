import 'package:flutter/material.dart';
import 'package:requisicoes_http/models/via_cep.dart';
import 'package:requisicoes_http/utilities/network_helper.dart';

class MinhaPaginaInicial extends StatelessWidget {
  var _dados = "";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Minhas Requisições"),),
      body: Text(_dados),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.send),
        onPressed: () async{
          var requisicao = NetworkHelper(url:"https://viacep.com.br/ws/01001000/json/");
          var dados = ViaCEP.fromJson(await requisicao.getData());
          print(dados.logradouro);
          print(dados.cep);
        },
      ),
    );
  }
}
