import { useState } from 'react';
import { useForm } from 'react-hook-form';
import './index.css'



const FormCadastro =() =>{

const {register, handleSubmit} = useForm()

const Cadastro = (cadastro) =>{
  alert('Cadastro realizado com sucesso')
  console.log(cadastro)
}






    return (
          
<div className='Cadastro'>

    <div class="formCad">
      <div class="title">Olá</div>
      <div class="subtitle">Vamos criar sua conta!</div>
      <div class="input-container">
      <label className='label'>Nome</label>
        <input id="firstname" class="input" type="text" placeholder="Nome" { ...register('nome') }/>

       
        <label className='label'>Senha</label>
      
        <input id="senha" class="input" type="password" placeholder="Senha" { ...register('senha') } />
       
     
      
        <label className='label'>Email</label>
        <input id="email" class="input" type="text" placeholder="Email" { ...register('email') } />
        <button type="text" class="submit" onClick={handleSubmit(Cadastro)}>submit</button>
      </div>
     
    </div>
    </div>       

    )
}
export default FormCadastro;