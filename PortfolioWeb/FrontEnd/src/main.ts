const { AngularWebpackPlugin } = require('@ngtools/webpack');
const linkerPlugin = require('@angular/compiler-cli/linker/babel');
platformBrowserDynamic().bootstrapModule(AppModule)
  .catch((err: any) => console.error(err));

  import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app/app.module';

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));

module.exports = {
  /* ... */
  module: {
    rules: [
      /* ... */
      {
        test: /\.[jt]sx?$/,
        loader: '@ngtools/webpack',
      },
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
  plugins: [
    new AngularWebpackPlugin({
      tsconfig: 'path/to/tsconfig.json',
      // ... other options as needed
    }),
  ],
};


