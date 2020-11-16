class MyHero{
  var _nome;
  var _sigularidade;
  var _urlImg;

  MyHero(this._nome, this._sigularidade, this._urlImg);

  @override
  String toString() {
    return 'MyHero{_nome: $_nome, _sigularidade: $_sigularidade, _urlImg: $_urlImg}';
  }

  get sigularidade => _sigularidade;

  get nome => _nome;

  get image => _urlImg;
}