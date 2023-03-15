import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { AngularWebpackPlugin } from '@ngtools/webpack';
import linkerPlugin from '@angular/compiler-cli/linker/babel';

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));

  

  exports = {
    /* ... */
    module: {
      rules: [
        /* ... */
        {
          test: /\.[jt]sx?$/,
          loader: '@ngtools/webpack',
        },
      ],
    },
  
    plugins: [
      new AngularWebpackPlugin({
        tsconfig: 'path/to/tsconfig.json',
        // ... other options as needed
      }),
    ],
  };

  

exports = {
  /* ... */
  module: {
    rules: [
      /* ... */
      {
        test: /\.[cm]?js$/,
        use: {
          loader: 'babel-loader',
          options: {
            cacheDirectory: true,
            compact: false,
            plugins: [linkerPlugin],
          },
        },
      },
    ],
  },
};
