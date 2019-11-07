import React from 'react';
import './landing-page.css';

const LandingPage = () => {
  return (
    <div>
      <div className='container'>
        <h3>Login </h3>
        <br />
        <div className='row'>
          <div className='form-group'>
            <input
              type='text'
              className='form-control'
              aria-describedby='emailHelp'
              placeholder='User Name'
            />
          </div>

          <div className='form-group'>
            <input
              type='password'
              className='form-control'
              placeholder='Password'
            />
          </div>

          <div className='form-group'>
            <p align='center'>
              <button className='btn btn-primary'>LOGIN</button>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default LandingPage;
