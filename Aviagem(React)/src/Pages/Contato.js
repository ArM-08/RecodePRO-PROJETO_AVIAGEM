import "../Components/Assets/css/style.css"
import { useForm } from 'react-hook-form'
import NavBar from './../Components/NavBar'
import Footer from "../Components/Footer";

const Contato = () => {
  const { register, handleSubmit} = useForm()
  const contatoMsg = (msg) => {
      alert('Mensagem enviada com sucesso')
      console.log(msg)
    }
      
  return (
    
    <div>
      <NavBar/>
      <div className="container-conta">
        <div className="row text-center mb-3">
          <h2 style={{fontFamily: "Tommy"}}>Como podemos ajudá-lo?</h2>
        </div>
        <div className="row">
          <div className="col">
            <div className="card mb-4" style={{ width: "18rem" }}>
              <div className="card-body">
                <h5 className="card-title2">Alterações e cancelamentos</h5>
                <p className="card-text">
                  Veja como fazer alterações em sua reserva e saiba tudo sobre
                  cancelamentos.
                </p>
                <a href="#" className="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>

          <div className="col">
            <div className="card mb-4" style={{ width: "18rem" }}>
              <div className="card-body">
                <h5 className="card-title2">Status da minha reserva</h5>
                <p className="card-text">
                  Encontre tudo o que você pode fazer com sua reserva e suas
                  solicitações.
                </p>
                <a href="#" className="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>

          <div className="col">
            <div className="card mb-4" style={{ width: "18rem" }}>
              <div className="card-body">
                <h5 className="card-title2">Informação sobre coronavírus</h5>
                <p className="card-text">
                  Confira as opções para alterar ou cancelar sua reserva de
                  acordo com a sua situação.
                </p>
                <a href="#" className="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>

          <div className="col">
            <div className="card mb-4" style={{ width: "18rem" }}>
              <div className="card-body">
                <h5 className="card-title2">Bagagem e check-in</h5>
                <p className="card-text">
                  Faça o web check-in, selecione seus assentos e veja a bagagem
                  disponível para sua viagem.
                </p>
                <a href="#" className="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>
        </div>
        <div className="row">
          <h4 style={{fontFamily: "Tommy"}}>Chat via email</h4>
        </div>
        <div className="row">
          <div className="col">
            <div className="mb-3">
              <form>
                <div className="form-outline mb-4">
                  <input type="text" id="inputNome" className="form-control" { ...register('nome') }/>
                  <label className="form-label" htmlFor="form4Example1">
                    Nome
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <input type="email" id="inputEmail" className="form-control" { ...register('email') }/>
                  <label className="form-label" htmlFor="form4Example2">
                    Email
                  </label>
                </div>

                <div className="form-outline mb-4">
                  <textarea
                    className="form-control"
                    id="inputMensagem"
                    rows="4"
                    { ...register('mensagem')}
                  ></textarea>
                  <label className="form-label" htmlFor="form4Example3">
                    Mensagem
                  </label>
                </div>

                <div className="form-check d-flex justify-content-center mb-4">
                  <input
                    className="form-check-input me-2"
                    type="checkbox"
                    value=""
                    id="form4Example4"
                    checked
                  />
                  <label className="form-check-label" htmlFor="form4Example4">
                    Me envie uma copia do email
                  </label>
                </div>

                <button type="submit" onClick={handleSubmit(contatoMsg)} className="btn btn-primary btn-block mb-4">
               
                  Enviar
                </button>
              </form>
            </div>
          </div>
        </div>
        <div className="row">
          <div className="col">
            <h4 className="tel">Telefones e e-mail para contato</h4>
            <p>080008080808</p>
            <p>(00)98279-28919</p>
            <p>E-mail: aviagemsuporte@aviagem.com</p>
            <p>Endereço: Avenida Brasil 000- Rio de Janeiro - RJ</p>
            <p>CEP: 0000000-0</p>
          </div>
        </div>
      </div>
      <Footer/>
    </div>
  );
};

export default Contato;
