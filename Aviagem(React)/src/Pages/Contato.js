import "../Components/Assets/css/style.css"
import { useForm } from 'react-hook-form'

const Contato = () => {
  const { register, handleSubmit} = useForm()
  const contatoMsg = (msg) => {
      console.log(msg)
    }
      
  return (
    <div>
      <div class="container-conta">
        <div class="row text-center mb-3">
          <h2 style={{fontFamily: "Tommy"}}>Como podemos ajudá-lo?</h2>
        </div>
        <div class="row">
          <div class="col">
            <div class="card mb-4" style={{ width: "18rem" }}>
              <div class="card-body">
                <h5 class="card-title2">Alterações e cancelamentos</h5>
                <p class="card-text">
                  Veja como fazer alterações em sua reserva e saiba tudo sobre
                  cancelamentos.
                </p>
                <a href="#" class="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>

          <div class="col">
            <div class="card mb-4" style={{ width: "18rem" }}>
              <div class="card-body">
                <h5 class="card-title2">Status da minha reserva</h5>
                <p class="card-text">
                  Encontre tudo o que você pode fazer com sua reserva e suas
                  solicitações.
                </p>
                <a href="#" class="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>

          <div class="col">
            <div class="card mb-4" style={{ width: "18rem" }}>
              <div class="card-body">
                <h5 class="card-title2">Informação sobre coronavírus</h5>
                <p class="card-text">
                  Confira as opções para alterar ou cancelar sua reserva de
                  acordo com a sua situação.
                </p>
                <a href="#" class="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>

          <div class="col">
            <div class="card mb-4" style={{ width: "18rem" }}>
              <div class="card-body">
                <h5 class="card-title2">Bagagem e check-in</h5>
                <p class="card-text">
                  Faça o web check-in, selecione seus assentos e veja a bagagem
                  disponível para sua viagem.
                </p>
                <a href="#" class="card-link">
                  Clique aqui
                </a>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <h4 style={{fontFamily: "Tommy"}}>Chat via email</h4>
        </div>
        <div class="row">
          <div class="col">
            <div class="mb-3">
              <form>
                <div class="form-outline mb-4">
                  <input type="text" id="inputNome" class="form-control" { ...register('nome') }/>
                  <label class="form-label" for="form4Example1">
                    Nome
                  </label>
                </div>

                <div class="form-outline mb-4">
                  <input type="email" id="inputEmail" class="form-control" { ...register('email') }/>
                  <label class="form-label" for="form4Example2">
                    Email
                  </label>
                </div>

                <div class="form-outline mb-4">
                  <textarea
                    class="form-control"
                    id="inputMensagem"
                    rows="4"
                    { ...register('mensagem')}
                  ></textarea>
                  <label class="form-label" for="form4Example3">
                    Mensagem
                  </label>
                </div>

                <div class="form-check d-flex justify-content-center mb-4">
                  <input
                    class="form-check-input me-2"
                    type="checkbox"
                    value=""
                    id="form4Example4"
                    checked
                  />
                  <label class="form-check-label" for="form4Example4">
                    Me envie uma copia do email
                  </label>
                </div>

                <button type="submit" onClick={handleSubmit(contatoMsg)} class="btn btn-primary btn-block mb-4">
               
                  Enviar
                </button>
              </form>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col">
            <h4 class="tel">Telefones e e-mail para contato</h4>
            <p>080008080808</p>
            <p>(00)98279-28919</p>
            <p>E-mail: aviagemsuporte@aviagem.com</p>
            <p>Endereço: Avenida Brasil 000- Rio de Janeiro - RJ</p>
            <p>CEP: 0000000-0</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Contato;
