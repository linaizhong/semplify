/* eslint-disable react/no-multi-comp */
/* eslint-disable react/display-name */
import React, {lazy} from 'react';
import {Redirect} from 'react-router-dom';
import ErrorLayout from './layouts/Error';
import DashboardLayout from './layouts/Dashboard';
import OverviewView from './views/Overview';
import IndexedDocuments from './views/Search/IndexedDocuments';

export default [
  {
    path: '/',
    exact: true,
    component: () => <Redirect to="/overview"/>
  },
  {
    path: '/errors',
    component: ErrorLayout,
    routes: [
      {
        path: '/errors/error-401',
        exact: true,
        component: lazy(() => import('src/views/Error401'))
      },
      {
        path: '/errors/error-404',
        exact: true,
        component: lazy(() => import('src/views/Error404'))
      },
      {
        path: '/errors/error-500',
        exact: true,
        component: lazy(() => import('src/views/Error500'))
      },
      {
        component: () => <Redirect to="/errors/error-404"/>
      }
    ]
  },
  {
    route: '*',
    component: DashboardLayout,
    routes: [
      {
        path: '/overview',
        exact: true,
        component: OverviewView
      },
      {
        path: '/search/index',
        exact: true,
        component: IndexedDocuments
      },
      {
        component: () => <Redirect to="/errors/error-404"/>
      }
    ]
  }
];
