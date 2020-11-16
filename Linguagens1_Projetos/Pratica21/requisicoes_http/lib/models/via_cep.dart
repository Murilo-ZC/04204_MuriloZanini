class ViaCEP {
  String _cep;
  String _logradouro;
  String _complemento;
  String _bairro;
  String _localidade;
  String _uf;
  String _ibge;
  String _gia;
  String _ddd;
  String _siafi;

  ViaCEP(
      {String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        String ibge,
        String gia,
        String ddd,
        String siafi}) {
    this._cep = cep;
    this._logradouro = logradouro;
    this._complemento = complemento;
    this._bairro = bairro;
    this._localidade = localidade;
    this._uf = uf;
    this._ibge = ibge;
    this._gia = gia;
    this._ddd = ddd;
    this._siafi = siafi;
  }

  String get cep => _cep;
  set cep(String cep) => _cep = cep;
  String get logradouro => _logradouro;
  set logradouro(String logradouro) => _logradouro = logradouro;
  String get complemento => _complemento;
  set complemento(String complemento) => _complemento = complemento;
  String get bairro => _bairro;
  set bairro(String bairro) => _bairro = bairro;
  String get localidade => _localidade;
  set localidade(String localidade) => _localidade = localidade;
  String get uf => _uf;
  set uf(String uf) => _uf = uf;
  String get ibge => _ibge;
  set ibge(String ibge) => _ibge = ibge;
  String get gia => _gia;
  set gia(String gia) => _gia = gia;
  String get ddd => _ddd;
  set ddd(String ddd) => _ddd = ddd;
  String get siafi => _siafi;
  set siafi(String siafi) => _siafi = siafi;

  ViaCEP.fromJson(Map<String, dynamic> json) {
    _cep = json['cep'];
    _logradouro = json['logradouro'];
    _complemento = json['complemento'];
    _bairro = json['bairro'];
    _localidade = json['localidade'];
    _uf = json['uf'];
    _ibge = json['ibge'];
    _gia = json['gia'];
    _ddd = json['ddd'];
    _siafi = json['siafi'];
  }

  Map<String, dynamic> toJson() {
    final Map<String, dynamic> data = new Map<String, dynamic>();
    data['cep'] = this._cep;
    data['logradouro'] = this._logradouro;
    data['complemento'] = this._complemento;
    data['bairro'] = this._bairro;
    data['localidade'] = this._localidade;
    data['uf'] = this._uf;
    data['ibge'] = this._ibge;
    data['gia'] = this._gia;
    data['ddd'] = this._ddd;
    data['siafi'] = this._siafi;
    return data;
  }
}