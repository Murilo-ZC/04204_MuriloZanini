import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:flutter/foundation.dart';

class NetworkHelper{
  final String url;
  NetworkHelper({this.url});

  Future getData() async{
    http.Response response = await http.get(url);
    if(response.statusCode == 200) {
      //Resultado da requisição
      return jsonDecode(response.body);
    }
    else{
      print(response.statusCode);
      return null;
    }
  }
}