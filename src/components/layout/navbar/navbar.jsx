import React from 'react';
import './navbar.css';
import { Link } from 'react-router-dom';

const NavBar = () => {
  return (
    <React.Fragment>
      <nav className='navbar navbar-expand-lg navbar-light bg-light'>
        <Link className='navbar-brand'>
          <img
            className='d-inline-block align-top'
            src='https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg'
            width='30'
            height='30'
            alt=''
          />{' '}
          Holy Cross
        </Link>

        <div className='collapse navbar-collapse'>
          <ul className='navbar-nav mr-auto'>
            <li className='nav-item active'>
              <a className='nav-link' href='!#'>
                Home <span className='sr-only'>(current)</span>
              </a>
            </li>

            <li className='nav-item active'>
              <a className='nav-link' href='!#'>
                Link
              </a>
            </li>
          </ul>
        </div>

        <div className='my-2 my-lg-0'>
          <button class='btn btn-outline-success my-2 my-sm-0' type='submit'>
            Search
          </button>
        </div>
      </nav>
    </React.Fragment>
  );
};

export default NavBar;
